public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;

        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("Oh Yes! " + query);
            }

            @Override
            public boolean isInterested(String query) {
                return query.toLowerCase().contains("friend");
            }
        });

        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("So long.... " + query);
            }

            @Override
            public boolean isInterested(String query) {
                return query.length() > 60;
            }
        });
    }
}

