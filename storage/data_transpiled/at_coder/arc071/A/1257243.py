def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.count = 0
        def __next__ ( self ) :
            return self.count
    for n in range ( sys.argv [ 1 ] ) :
        cnt = [ [ 'z' - 'a' + 1 ] ]
        for i in range ( n ) :
            data = sys.stdin.read ( n )
            for j in data :
                cnt [ i ] [ j - 'a' ] += 1
        ans = ""
        for i in range ( 'z' - 'a' + 1 ) :
            min = sys.maxsize
            for j in range ( n ) :
                min = min ( min , cnt [ j ] [ i ] )
            c = chr ( ord ( 'a' ) + i )
            for j in range ( min ) :
                ans += c.encode ( 'utf-8' )
        print ( ans )
