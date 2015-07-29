package com.thoughtstreamllc.lambdas;

public class Book {
    private String mTitle;
    private String mAuthor;
    private int mPublicationDate;

    public Book(String title, String author, int publicationDate) {
        mTitle = title;
        mAuthor = author;
        mPublicationDate = publicationDate;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public int getPublicationDate() {
        return mPublicationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "mTitle='" + mTitle + '\'' +
                ", mAuthor='" + mAuthor + '\'' +
                ", mPublicationDate=" + mPublicationDate +
                '}';
    }
}
