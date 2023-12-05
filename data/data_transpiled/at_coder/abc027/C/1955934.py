def main ( ) :
    import sys
    from time import sleep
    n = sleep ( 1 )
    win = False
    now = n + 1
    while now != 1 :
        now = now // 2 + now % 2
        win = False
        if now == 1 :
            break
        now = ( now - 1 ) // 2 + ( now + 1 ) % 2
        win = True
    print ( 'Takahashi' if win else 'Aoki' )
