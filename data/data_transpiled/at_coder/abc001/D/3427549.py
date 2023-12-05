def main ( ) :
    import sys
    from os import path
    from time import sleep
    from os.path import join
    from os import path
    from os.path import join
    from os import path
    from os import sep
    from os.path import join
    from os import sep
    from os import sep
    from os import chdir
    N = len ( sys.argv )
    imos = [ ]
    for i in range ( N ) :
        strs = path.split ( '-' )
        s = int ( floor ( int ( strs [ 0 ] ) / 5.0f ) )
        e = int ( ceil ( int ( strs [ 1 ] ) / 5.0f ) )
        if str ( e * 5 ).endswith ( '60' ) :
            e = ( e * 5 + 40 ) / 5
        imos [ s ] += 1
        imos [ e ] -= 1
    ss , v = - 1 , 0
    for i in imos :
        v += i
        if v > 0 and ss == - 1 :
            ss = i
        elif v == 0 and ss != - 1 :
            print ( '%04d-%04d' % ( ss * 5 , i * 5 ) )
            ss = - 1
