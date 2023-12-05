def import _distinct_chars
class Main ( object ) :
    def __init__ ( self ) :
        sc = _distinct_chars ( self.input_str )
        input = sc.next ( )
        if self.distinct_chars ( input ) :
            self.print ( "Yes" )
        else :
            self.print ( "No" )
    def distinct_chars ( self ) :
        total_chars = 0
        alphabet = [ 0 for i in range ( 26 ) ]
        for aux in self.input_str :
            char_number = ord ( aux )
            alphabet [ char_number - 97 ] += 1
        for i in range ( 26 ) :
            if alphabet [ i ] % 2 != 0 :
                return False
        return True
