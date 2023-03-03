def main ( ) :
    import sys
    from os.path import basename
    sc = open ( basename ( sys.argv [ 0 ] ) )
    name = sc.read ( )
    print ( name [ 0 ].upper ( ) + name [ 1 : ].lower ( ) )
