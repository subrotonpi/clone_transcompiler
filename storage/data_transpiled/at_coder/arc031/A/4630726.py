def main ( ) :
    import sys
    from os import path
    from os import listdir
    from os import getcwd
    from os.path import join
    from os.path import join
    from os.path import join
    from os import getcwd
    from os.path import join
    N = join ( getcwd ( ) , '..' )
    if len ( N ) % 2 == 0 :
        mae = N [ : len ( N ) / 2 ]
        ato = N [ len ( N ) / 2 : ]
    else :
        mae = N [ : len ( N ) / 2 ]
        ato = N [ len ( N ) / 2 + 1 : ]
    cnt = 0
    flg = True
    for i in range ( len ( N ) / 2 , 0 , - 1 ) :
        if mae [ cnt ] != ato [ i - 1 ] :
            flg = False
        cnt += 1
    print ( 'YES' if flg else 'NO' )
