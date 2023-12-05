def main ( ) :
    import sys
    from math import pow
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from sys import stdout
    from os.path import join
    from os import sep
    from os import chdir
    reader = open ( join ( sys.argv [ 1 : ] , '..' ) )
    a = reader.read ( )
    b = reader.read ( )
    N = int ( a + b )
    ans = 'No'
    base = 1
    while pow ( ( base , N ) , 2 ) <= N :
        if pow ( ( base , N ) , 2 ) == N :
            ans = 'Yes'
        base += 1
    sys.stdout.write ( ans )
    reader.close ( )
