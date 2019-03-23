package tech.logikode.mussik;

class Genre {
    private String mTitle;
    private int mCoverImageId;

    Genre(String title, int coverImageId) {
        mTitle = title;
        mCoverImageId = coverImageId;
    }

    String getTitle() {
        return mTitle;
    }

    int getCoverImageId() {
        return mCoverImageId;
    }
}
