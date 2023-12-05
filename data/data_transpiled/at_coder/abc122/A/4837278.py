def main ( ) :
    import sys
    from os.path import join
    stdin = open ( join ( sys.argv [ 1 : ] , 'r' ) )
    a , b = stdin.read ( ).split ( )
    if a == 'A' :
        sys.stdout.write ( 'T' )
    elif a == 'T' :
        sys.stdout.write ( 'A' )
    elif a == 'C' :
        sys.stdout.write ( 'G' )
    elif a == 'G' :
        sys.stdout.write ( 'C' )
