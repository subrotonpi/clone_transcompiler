def _import ( ) : return sys.stdin.read ( )
import csv
import csv
class Main ( csv.reader ) :
    def __init__ ( self ) :
        csv.reader.__init__ ( self )
        self.cir = csv.reader.read ( )
        self.reg = csv.reader.read ( )
    def region_reg ( self , Cir , x , y ) :
        Cir = [ int ( i ) for i in cir ]
        Reg = [ int ( i ) for i in reg ]
        Reg = [ int ( i ) for i in reg ]
        a = ( region_reg ( Reg , Cir [ 0 ] , Cir [ 1 ] + Cir [ 2 ] ) or region_reg ( Reg , Cir [ 0 ] , Cir [ 1 ] - Cir [ 2 ] ) or region_reg ( Reg , Cir [ 0 ] + Cir [ 2 ] , Cir [ 1 ] ) or region_reg ( Reg , Cir [ 0 ] - Cir [ 2 ] , Cir [ 1 ] ) )
        c = [ ]
        k = 0
        for i in range ( 0 , 3 , 2 ) :
            for j in range ( 1 , 4 , 2 ) :
                c.append ( region_cir ( Cir , i , j ) )
                k += 1
        b = ( 'YES' if c [ 0 ] == 'YES' else 'NO' )
        print ( a )
        print ( b )
    def region_cir ( self , x , y ) :
        if self.Reg [ 0 ] <= x <= y and x <= y <= self.Reg [ 2 ] and y <= self.Reg [ 3 ] :
            return False
        return True
    def region_cir ( self , x , y ) :
        if ( ( self.Cir [ 0 ] - x ) ** 2 + ( self.Cir [ 1 ] - y ) ** 2 ) > self.Cir [ 2 ] * x + ( self.Cir [ 2 ] - y ) ** 2 :
            return True
        return False
