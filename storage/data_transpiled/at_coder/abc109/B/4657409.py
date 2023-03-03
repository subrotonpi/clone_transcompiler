def main ( ) :
    import sys
    from os.path import join
    from os import listdir
    from os.path import join
    from os.path import join
    from os.path import isfile
    from os.path import join
    from os.path import dirname
    from os import sep
    from os.path import join
    n = len ( open ( join ( dirname ( __file__ ) , 'r' ) ) )
    flg = True
    s = [ ]
    for S in listdir ( join ( dirname ( __file__ ) , 'r' ) ) :
        if all ( x in S for x in s ) :
            flg = False
        s.append ( S )
    for i in range ( 1 , n ) :
        if not ( s [ i - 1 ] [ - 1 ] == s [ i ] [ 0 ] ) :
            flg = False
    print ( 'Yes' if flg else 'No' )
