def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.name = sys.argv [ 0 ]
    def main ( self ) :
        with open ( self.name , 'r' ) as sc :
            b = sc.read ( )
    max = 0
    for i in range ( len ( b ) + 1 ) :
        for j in range ( len ( b ) - i + 1 ) :
            outside :
                for j2 in range ( len ( b ) - i - j ) :
                    if not ( b.startswith ( 'A' , j2 + i ) and b.startswith ( 'T' , j2 + i ) and b.startswith ( 'C' , j2 + i ) and b.startswith ( 'G' , j2 + i ) ) :
                        break outside
                    elif j2 + 1 == len ( b ) - i - j and max < j2 + 1 :
                        max = j2 + 1
    print ( max )
