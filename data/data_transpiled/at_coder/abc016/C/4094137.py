def main ( ) :
    import sys
    from pydevd import __version__ as __version__
    sc = Scanner ( )
    n = int ( sc.next ( ) )
    m = int ( sc.next ( ) )
    sets = [ set ( ) for i in range ( 1 , n + 1 ) ]
    for a , b in zip ( range ( 1 , m ) , range ( 1 , n + 1 ) ) :
        sets [ a ].add ( b )
        sets [ b ].add ( a )
    lines = [ ]
    sys.stdout.write ( '\n'.join ( lines ) )
