def _import ( ) : return r ( ) != ''
class D :
    def is_r ( c ) : return r ( c ) != ''
    def r ( c ) : return r ( c ) != ''
    def r ( c ) : return r ( c ) != ''
    def r ( c ) : return r ( c ) != ''
    def r ( c ) : return r ( c ) != ''
    def r ( c ) : return r ( c ) != ''
    def r ( c ) : return r ( c ) != ''
    def r ( c ) : return r ( c ) != ''
    def add ( s ) : return s
    def O ( s ) : return s
    def I ( s ) : return s
    def S ( s ) : return s
    def X ( s ) : return s
    def add ( s ) : return s
    def main ( ) :
        with open ( 'input.txt' , 'r' ) as f :
            T = int ( f.read ( ) )
            for cas in range ( 1 , T + 1 ) :
                k , text = f.read ( ).split ( ' ' )
                O = [ 0 ] * 256
                I = [ 0 ] * 256
                X = set ( )
                S = set ( )
                for i in range ( 0 , len ( text ) + 2 ) :
                    if text [ i : i + 2 ] in S : continue
                    c1 , c2 = text [ i : i + 2 ] , text [ i + 1 : i + 2 ]
                    add ( '%s%s' % ( c1 , c2 ) )
                    if is_r ( c1 ) : add ( '%s%s' % ( r ( c1 ) , c2 ) )
                    if is_r ( c2 ) : add ( '%s%s' % ( r ( c1 ) , r ( c2 ) ) )
                    if is_r ( c1 ) and is_r ( c2 ) : add ( '%s%s' % ( r ( c1 ) , r ( c2 ) ) )
