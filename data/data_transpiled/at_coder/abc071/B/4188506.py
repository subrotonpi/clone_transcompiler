def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main.sc
        mod = 1000000007
    def main ( self ) :
        s = sc.next ( )
        alphabet = [ True for c in s if c - 97 ]
        for i in range ( 26 ) :
            if alphabet [ i ] == False :
                c = chr ( i + 97 )
                print ( c )
                return
        print ( "None" )
