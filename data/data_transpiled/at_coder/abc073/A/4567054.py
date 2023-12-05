def main ( ) :
    import sys
    from os import path
    from os import urandom
    sc = open ( path ( "/home/vagrant/vagrant/" ) , 'w' )
    N = int ( sc.read ( ) )
    if N % 10 == 9 or N >= 90 :
        print ( "Yes" , file = sys.stdout )
    else :
        print ( "No" , file = sys.stdout )
    sys.stdout.flush ( )
