def main ( ) :
    import os
    global N , H , W , bmax , kingaku
    scanning ( )
    bup += edown
    dup += edown
    W = N * edown - H
    bmax = W / bup + 1
    if W > 0 :
        Wtemp = 0
        kingaku = bmax * ayen
        for i in range ( bmax ) :
            Wtemp = W - i * bup
            kingaku = min ( kingaku , i * ayen + ( Wtemp / dup + 1 ) * cyen )
    print ( kingaku )
