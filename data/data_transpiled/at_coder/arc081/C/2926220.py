def import _main
class Main ( object ) :
    def main ( sc ) :
        a = sc.read ( )
        a = a.split ( '' )
        d = { }
        for i in range ( len ( a ) ) :
            d.setdefault ( a [ i ] , [ ] )
            d [ a [ i ] ].append ( i + 1 )
        data = [ ]
        bset = [ ]
        data.append ( 0 )
        for i in range ( len ( a ) - 1 , - 1 , - 1 ) :
            bset.append ( a [ i ] - 'a' )
            data.append ( data [ i + 1 ] )
            if len ( bset ) == 26 :
                bset = [ ]
                data.append ( 1 )
        p = 0
        anslen = data [ 0 ] + 1
        ans = [ ]
        for i in range ( anslen ) :
            for c in [ 'a' , 'z' ] :
                if c not in d :
                    ans.append ( c )
                    p = i + 1
                    break
                else :
                    next = d [ c ].higher ( p )
                    if next is None or ( data [ p ] - data [ next ] == 1 ) :
                        ans.append ( c )
                        p = _get_or_default ( next , len ( ans ) + 1 )
                        break
        print ( ''.join ( ans ) )
    def get_or_default ( n , default = None ) :
        return n or default
    def main ( sc ) :
        with open ( '/etc/init.d' , 'r' ) as sc :
            eval ( sc )
            sc.close ( )
