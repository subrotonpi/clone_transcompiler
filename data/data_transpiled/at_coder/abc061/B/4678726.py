def main ( ) :
    import sys
    from os.path import join
    from os import sep
    from os import sep
    from sys import stdin
    input = stdin.read ( )
    tokens = input.split ( sep )
    a = int ( tokens [ 0 ] )
    b = int ( tokens [ 1 ] )
    city = [ 0 ] * ( a + 1 )
    for i in range ( b ) :
        tokens = input.split ( sep )
        city [ int ( tokens [ 0 ] ) ] += 1
        city [ int ( tokens [ 1 ] ) ] += 1
    output = [ ]
    for i in range ( 1 , a + 1 ) :
        output.append ( "%d\n" % city [ i ] )
    sys.stdout.write ( "\n".join ( output ) )
