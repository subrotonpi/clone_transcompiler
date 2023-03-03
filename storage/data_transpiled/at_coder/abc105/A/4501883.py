def main ( ) :
    import sys
    from os.path import join
    from os import urandom
    reader = open ( join ( sys.argv [ 1 : ] , 'r' ) )
    N = int ( reader.read ( ) )
    K = int ( reader.read ( ) )
    ans = 0
    if N % K > 0 :
        ans = 1
    reader.close ( )
    sys.stdout.write ( ans )
