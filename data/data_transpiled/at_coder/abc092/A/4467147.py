def main ( ) :
    import sys
    from numpy import arange
    A , B , C , D = map ( int , sys.stdin.read ( ).split ( ',' ) )
    train = min ( A , B )
    bus = min ( C , D )
    print ( train , bus )
