class Author{
    public String AuthorName;
    public String AuthorBio;
    book book;


    public Author(String AuthorName, String AuthorBio , Book book){
        AuthorName= authorName;
        AuthorBio=authorBio;
        this.book=book;
    }





    @Override
    public String toString() {
        return "Author{" +
                "AuthorName"
    }
}