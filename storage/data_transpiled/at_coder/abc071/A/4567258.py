def main ( ) :
    import sys
    from os.path import join
    from os import sep
    from os.path import join
    sc = open ( join ( sys.argv [ 1 : ] , '..' ) , 'r' )
    out = sys.stdout
    N = int ( sc.read ( ) )
    A = int ( sc.read ( ) )
    B = int ( sc.read ( ) )
    flg = abs ( A - N ) > abs ( B - N )
    if flg :
        out.write ( 'B\n' )
    else :
        out.write ( 'A\n' )
    out.flush ( )
