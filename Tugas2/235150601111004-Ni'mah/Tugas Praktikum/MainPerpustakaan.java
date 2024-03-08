
public class MainPerpustakaan {
    public static void main(String[] args) {
        System.out.println("SELAMAT DATANG DI PERPUSTAKAAN X");
        System.out.println("Berikut ini adalah jenis-jenis buku yang tersedia di perpustakaan X :");
        System.out.println("==========================================================================");

        Perpustakaan Teknologi = new Perpustakaan();
        System.out.println("<<<<<<BUKU TEKNOLOGI>>>>>>");
        Teknologi.judulBuku1("-Introduction to Java Programming, Comprehensive Version, 10th Edition-", "Y. Daniel Liang");  
        Teknologi.judulBuku2("-The Design of Everyday Things -"," Don Norman");
        Teknologi.judulBuku3("-Cybersecurity for Beginners-","Joe Weinman");
        Teknologi.judulBuku4("-Networking Fundamentals-","Mike Meyers");
        Teknologi.judulBuku5("-Amazon Web Services in Action -","Andreas Wittig, Michael Wittig");
        Teknologi.tampilan();
        System.out.println("==========================================================================");

        Perpustakaan Filsafat = new Perpustakaan();
        System.out.println("<<<<<<BUKU FILSAFAT>>>>>>");
        Filsafat.judulBuku1("-Metafisika-", "Aristoteles");
        Filsafat.judulBuku2("-Being and Time-", "Martin Heidegger");
        Filsafat.judulBuku3("-An Enquiry Concerning Human Understanding-", "David Hume ");
        Filsafat.judulBuku4("-The Aims of the Philosophers, The Book of Letters-", "Al-Farabi");
        Filsafat.judulBuku5("-The Republic-", "Plato");
        Filsafat.tampilan();
        System.out.println("==========================================================================");

        Perpustakaan Sejarah = new Perpustakaan();
        System.out.println("<<<<<<BUKU SEJARAH>>>>>>");
        Sejarah.judulBuku1("-Sejarah Peradaban Manusia-", "Richard Osborne.");
        Sejarah.judulBuku2("-Sejarah Dunia-", "JM Roberts");
        Sejarah.judulBuku3("-The Guns of August-", "Barbara W. Tuchman");
        Sejarah.judulBuku4("-Guns, Germs, and Steel: The Fates of Human Societies-", "Jared Diamond");
        Sejarah.judulBuku5("-The Rise and Fall of the Third Reich-", "William L.Shirer");
        Sejarah.tampilan();
        System.out.println("==========================================================================");

        Perpustakaan Agama = new Perpustakaan();
        System.out.println("<<<<<<BUKU AGAMA>>>>>>");
        Agama.judulBuku1("-An Introduction to Islamic Theology and Law-", "Ignaz Goldziher");
        Agama.judulBuku2("-A History of God-", "Karen Armstrong");
        Agama.judulBuku3("-The Varieties of Religious Experience-", "William James");
        Agama.judulBuku4("-A Concise Introduction to World Religions", "Willard G. Oxtoby");
        Agama.judulBuku5("-The Art of Happiness-", " Dalai Lama dan Howard Cutler");
        Agama.tampilan();
        System.out.println("==========================================================================");

        Perpustakaan Psikologi = new Perpustakaan();
        System.out.println("<<<<<<BUKU PSIKOLOGI>>>>>>");
        Psikologi.judulBuku1("-The 5 AM Club-", "Robin Sharma");
        Psikologi.judulBuku2("-The Power of Habit -", " Charles Duhigg");
        Psikologi.judulBuku3("-Flow: The Psychology of Optimal Experience-", "Mihaly Csikszentmihalyi");
        Psikologi.judulBuku4("-The Psychology of Money-", "Morgan Housel");
        Psikologi.judulBuku5("-Quiet: The Power of Introverts in a World That Can't Stop Talking-", "Susan Cain");
        Psikologi.tampilan();
        System.out.println("==========================================================================");

        Perpustakaan Politik = new Perpustakaan();
        System.out.println("<<<<<<BUKU POLITIK>>>>>>");
        Politik.judulBuku1("-Dua Risalah tentang Pemerintahan-", "John Locke ");
        Politik.judulBuku2("-How Democracies Die-", "Steven Levitsky dan Daniel Ziblatt");
        Politik.judulBuku3("-The World Is Flat 3.0: A Brief History of the Twenty-first Century-", "Thomas L. Friedman");
        Politik.judulBuku4("-The End of the World Is Just the Beginning: Mapping the Collapse of Globalization-", "Peter Zeihan");
        Politik.judulBuku5("-The Road to Serfdom-", "Friedrich Hayek");
        Politik.tampilan();
        System.out.println("==========================================================================");

        Perpustakaan Fiksi = new Perpustakaan();
        System.out.println("<<<<<<BUKU FIKSI>>>>>>");
        Fiksi.judulBuku1("-Galaksi-", "Poppi Pertiwi");
        Fiksi.judulBuku2("-Pulang-", "Tere Liye");
        Fiksi.judulBuku3("-Merkuri-", "Amy Jo Burns");
        Fiksi.judulBuku4("-My Friends-", "Hisham Matar");
        Fiksi.judulBuku5("-Bumi Manusia-", "Pramoedya Ananta Toer");
        Fiksi.tampilan();
        System.out.println("==========================================================================");
    }
}