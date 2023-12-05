def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main.sc
        mod = 1000000007
        def main ( self ) :
            s = sc.next ( ).split ( )
            t = sc.next ( ).split ( )
            t = [ x for x in t if x != mod ]
            t2 = [ str ( x ) for x in t ].reverse ( )
            s = [ x for x in s if x != mod ]
            s2 = str ( s )
            print ( 'Yes' if s2 < t2 else 'No' )
