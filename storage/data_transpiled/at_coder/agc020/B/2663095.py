def import import sys
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.k = sc.randint ( 1 , 4 )
        a = [ ]
        for i in range ( k ) :
            a.append ( sc.randint ( 1 , 4 ) )
        if len ( a ) != 2 :
            print ( - 1 )
            return
        min = 2
        max = 2
        for i in range ( k - 1 ) :
            min = a [ i + 1 ] * ( ( min + a [ i + 1 ] - 1 ) / a [ i + 1 ] )
            max = a [ i + 1 ] * ( ( max + a [ i ] - 1 ) / a [ i + 1 ] )
            min_a = a [ i + 1 ] * ( ( min + a [ i + 1 ] - 1 ) / a [ i + 1 ] )
            if min_a > max :
                print ( - 1 )
                return
        max += a [ k - 1 ] - 1
        print ( min , max )
    def main ( ) :
        with open ( '/tmp/main.py' ) as f :
            f.write ( sys.stdin.read ( ) )
