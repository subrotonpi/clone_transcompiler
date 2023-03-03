def import _main
class Main ( object ) :
    def __init__ ( self , sc ) :
        s = sc.read ( )
        t = sc.read ( )
        resolve = False
        slen = len ( s )
        tlen = len ( t )
        for i in range ( slen - tlen , - 1 , - 1 ) :
            if _main ( [ s [ i : i + tlen ] , t [ i : i + tlen ] ] ) :
                for j in range ( tlen ) :
                    s [ i + j ] = t [ j ]
                resolve = True
                break
        print ( ''.join ( s ).replace ( '?' , 'a' ) if resolve else 'UNRESTORABLE' )
    def check ( s , t ) :
        for i in range ( len ( s ) ) :
            if s [ i ] != '?' and s [ i ] != t [ i ] :
                return False
        return True
    def main ( self ) :
        with open ( '../../../../../../.././.././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././././.././././././.././././../././.