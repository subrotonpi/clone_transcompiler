def import _np
import __builtin__
import __builtin__
import __builtin__
import __builtin__
class Main ( object ) :
    def __init__ ( self , v ) :
        self.v = v
    def REPS ( self , l , r ) :
        return __builtin__.range ( self.l , self.r )
    def INS ( self , n ) :
        return REPS ( self , n ).map ( int )
    def get_int ( self ) :
        return int ( self.s.readline ( ) )
    def main ( self ) :
        n , a , b = self.get_int ( )
        d = self.INS ( n ).astype ( 'float64' )
        min , max , r = [ d.min ( ).astype ( 'float64' ) for d in d ]
        r = b / ( max - min )
        self.REPS ( n ).update ( d )
        if __builtin__.isinf ( r ) :
            print ( - 1 )
        else :
            print ( '%f %f\n' % ( r , a - np.average ( d ).astype ( 'float64' ) ) )
