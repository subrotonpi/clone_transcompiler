def main ( ) :
    import sys
    from os.path import join
    from os import chdir
    sc = open ( join ( chdir , '..' ) )
    N = sc.read ( )
    A = sc.read ( )
    B = sc.read ( )
    winner = ''
    if N > A :
        if N - A > B :
            if N % ( A + B ) == 0 :
                winner = 'Bug'
            elif N % ( A + B ) <= A :
                winner = 'Ant'
            else :
                winner = 'Bug'
        else :
            winner = 'Bug'
    else :
        winner = 'Ant'
    print ( winner )
