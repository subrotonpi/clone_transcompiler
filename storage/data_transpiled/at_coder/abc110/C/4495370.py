def _import ( ) :
    import collections
    import string
    import string
    import string
    import string
    class Main ( TestCase ) :
        YES = string.Yes
        NO = string.No
    def process ( self ) :
        S = self.S
        T = self.T
        s_char_freq = _count_char_freqs ( S )
        t_char_freq = _count_char_freqs ( T )
        s_freq_dict = to_freq_dict ( s_char_freq )
        t_freq_dict = to_freq_dict ( t_char_freq )
        return s_freq_dict , t_freq_dict
    def count_char_freqs ( data ) :
        d = { }
        data.chars.update ( { i : ord ( i ) for i in data } )
        return d
    def to_freq_dict ( char_freq ) :
        d = { }
        char_freq.values ( ).update ( { i : ord ( i ) for i in data } )
        return d
    def main ( ) :
        case , result = read_from_input ( )
        self.output ( result )
    def read_from_input ( ) :
        with open ( "input.txt" , "r" ) as sc :
            S , T = sc.read ( ).split ( "\n" )
        return S , T
    def output ( self ) :
        print ( self.output ( ) )
    class Main ( TestCase ) :
        S = string.ascii_lowercase
        T = string.ascii_uppercase
    def process ( self ) :
        self.S = S
        self.T = T
    def process ( self ) :
        self.S = S
        self.T = T
    return Main
