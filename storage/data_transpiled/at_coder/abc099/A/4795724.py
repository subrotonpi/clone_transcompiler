def main ( ) :
    import sys
    from os.path import join
    from os import urandom
    reader = open ( join ( sys.argv [ 1 : ] , 'r' ) )
    N = len ( reader.read ( ) )
    ans = 'ABD'
    if N < 1000 :
        ans = 'ABC'
    sys.stdout.write ( ans )
    reader.close ( )
