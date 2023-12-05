def main ( ) :
    import sys
    from os import path
    from os import path
    from os import sep
    from os import path
    N = path.split ( sep )
    path.remove ( sep )
    ans = 'No'
    if ( N [ 0 ] == N [ 1 ] and N [ 1 ] == N [ 2 ] ) or ( N [ 1 ] == N [ 2 ] and N [ 2 ] == N [ 3 ] ) :
        ans = 'Yes'
    print ( ans )
