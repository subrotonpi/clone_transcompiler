def main ( ) :
    import sys
    from os import path
    with open ( path.join ( path.dirname ( __file__ ) , '..' , '..' , '..' , '..' ) , 'r' ) as sc :
        n = sc.read ( )
        ans = int ( n [ 0 ] )
        if n [ 0 ] < n [ 1 ] or n [ 0 ] < n [ 2 ] :
            ans += 1
        print ( ans * 100 + ans * 10 + ans )
