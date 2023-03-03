def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            arr = sys.stdin.read ( ).decode ( 'utf-8' )
            chars = [ 0 ] * 26
            for c in arr :
                chars [ c - 'a' ] += 1
            length = len ( arr )
            total = length * ( length - 1 ) / 2 + 1
            for x in chars :
                if x > 1 :
                    total -= x * ( x - 1 ) / 2
            print ( total )
