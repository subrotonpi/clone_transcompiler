def import _sys , readinput
class Main ( object ) :
    def __init__ ( self ) :
        self.readinput ( )
        self.solve ( )
    def solve ( self ) :
        c_array = self.S.split ( )
        sum = [ 'z' - 'a' + 1 ]
        for idx in c_array :
            sum [ idx ] - 'a'
            idx += 1
        ans = 0
        conv = [ - 1 ] * ( 1 << 26 )
        conv [ 0 ] = 1
        max = 1 << 26
        for bit in range ( 1 , max ) :
            conv [ bit ] = 0
            for idx in range ( 26 ) :
                b_idx = 1 << idx
                if bit & b_idx :
                    conv [ bit ] = ( conv [ bit - b_idx ] * sum [ idx ] ) % 1000000007
                    break
            ans = ( ans + conv [ bit ] ) % 1000000007
        print ( ans )
    def readinput ( self ) :
        with open ( 'input.txt' , 'r' ) as f :
            self.S = f.read ( )
