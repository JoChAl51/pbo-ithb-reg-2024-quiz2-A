package view;

import javax.swing.*;

public class BookList extends JFrame {
	public BookList() {
		setVisible(true);
		initComponent();
	}

	private void initComponent() {
	    setSize(800, 300);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Book List");

		JPanel createTransactionBook = new JPanel();
		createTransactionBook.setLayout(null);
		createTransactionBook.setBounds(10, 10, 780, 280);

		JLabel titleBukuLabel = new JLabel("Title Buku: ");
		titleBukuLabel.setBounds(0, 0, 100, 30);
		createTransactionBook.add(titleBukuLabel);

//		JTextField titleBukuField = new JTextField();
//		titleBukuField.setBounds(110, 0, 400, 30);
//		createTransactionBook.add(titleBukuField);

		JLabel coverBukuLabel = new JLabel("Cover Buku: ");
		coverBukuLabel.setBounds(0, 40, 100, 30);
		createTransactionBook.add(coverBukuLabel);

		JLabel authorBukuLabel = new JLabel("Author Buku: ");
		authorBukuLabel.setBounds(0, 80, 100, 30);
		createTransactionBook.add(authorBukuLabel);

		JLabel genreBukuLabel = new JLabel("Genre Buku: ");
		genreBukuLabel.setBounds(0, 120, 100, 30);
		createTransactionBook.add(genreBukuLabel);

		JLabel priceBukuLabel = new JLabel("Price Buku: ");
		priceBukuLabel.setBounds(0, 160, 100, 30);
		createTransactionBook.add(priceBukuLabel);

		JButton buyBookButton = new JButton("Buy Book");
		buyBookButton.setBounds(0, 210, 765, 30);
		createTransactionBook.add(buyBookButton);

		add(createTransactionBook);
	}

	public static void main(String[] args) {
		new BookList();
	}
}
