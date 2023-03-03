def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _scanner ( )
        self.sc = sc
    def read ( self ) :
        N = self.readInt ( )
        char_matrix = [ ]
        for i in range ( N ) :
            tmp_str = self.sc.read ( )
            for j in range ( N ) :
                char_matrix.append ( tmp_str [ j ] )
        cnt = 0
        for i in range ( N ) :
            shifted_matrix = self.shift_char_matrix ( char_matrix [ : , i ] )
            if self.check_char_matrix_symmetry ( shifted_matrix ) :
                cnt += N
        print ( cnt )
    def shift_char_matrix ( self , matrix , H , W ) :
        SIZE_H , SIZE_W = self.matrix.shape
        shifted_matrix = [ ]
        for h in range ( SIZE_H ) :
            for w in range ( SIZE_W ) :
                next_h = ( h + H ) % SIZE_H
                next_w = ( w + W ) % SIZE_W
                shifted_matrix.append ( matrix [ h , w ] )
        return shifted_matrix
    def check_char_matrix_symmetry ( self ) :
        N = self.matrix.shape [ 0 ]
        for i in range ( N ) :
            for j in range ( i , N ) :
                if self.matrix [ i , j ] != self.matrix [ j , i ] :
                    return False
        return True
    def read_char ( self ) :
        return self.sc.read ( ) [ 0 ]
    def readInt ( self ) :
        return int ( self.sc.read ( ) )
    def readLong ( self ) :
        return long ( self.sc.read ( ) )
