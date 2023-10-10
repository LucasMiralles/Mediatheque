package mediatheque;

public interface ModemVisitor {
    void visit(Book b);
    void visit(CD c);
}
