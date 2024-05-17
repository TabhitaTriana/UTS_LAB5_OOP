package no2;

class PalindromCheck {
    public boolean isPalindrom(String str) {
        // Menghapus spasi dan mengubah menjadi huruf kecil
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Memeriksa palindrom
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

