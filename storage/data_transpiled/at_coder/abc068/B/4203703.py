def main ( srgs ) :
    import sys
    from os.path import join
    from os import urandom
    a = urandom ( 2 )
    ans = 0
    ansc = 0
    for i in range ( 1 , a + 1 ) :
        count = 0
        for j in range ( i , i % 2 ) :
            count += 1
        if ansc < count :
            ans = i
            ansc = count
    print ( 1 if a == 1 else ans )
