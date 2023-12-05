def import import _eval
class Bullseye ( object ) :
    def __init__ ( self , num_rings , rad ) :
        self.num_rings = num_rings
    def eval ( self , num_rings , rad ) :
        out = [ ]
        num_cases = self.num_rings
        for case_num in range ( 1 , num_cases + 1 ) :
            out.append ( 'Case #%d: ' % case_num )
            rad = self.num_rings
            t = self.num_rings
            min = max = min ( int ( rad ) / ( 2 * rad ) + 1 , int ( math.sqrt ( int ( rad ) ) ) + 200 )
            while min < max - 1 :
                guess = ( max + min ) / 2
                check = eval ( guess , rad )
                if check > t :
                    max = guess
                else :
                    min = guess
            out.append ( min )
            out.append ( '\n' )
        sys.stdout.write ( out )
    def eval ( self , num_rings , rad ) :
        return ( 2 * num_rings + 2 * rad - 1 ) * num_rings
