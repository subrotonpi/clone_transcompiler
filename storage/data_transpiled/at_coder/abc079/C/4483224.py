def import _main
class Main ( object ) :
    def main ( sc ) :
        s = sc.split ( )
        ans = [ ]
        for i in range ( 4 ) :
            ans.append ( s [ i ] )
        for tmp in ( 1 << 3 ) :
            for b in range ( 3 ) :
                ans.append ( ( '+' if ( ( ( tmp & ( 1 << b ) ) >> b ) == 1 ) else '-' ) )
            if check ( ans ) :
                print ( '{}=7'.format ( ans ) )
                break
    def check ( str ) :
        ans = str [ 0 ] - '0'
        for i in range ( 3 ) :
            if str [ i * 2 + 1 ] == '+' :
                ans += str [ i * 2 + 2 ] - '0'
            else :
                ans -= str [ i * 2 + 2 ] - '0'
        return ans == 7
