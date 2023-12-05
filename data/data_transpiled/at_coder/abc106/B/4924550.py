def main ( args ) :
    import sys
    from os.path import join
    from os import urandom
    n = urandom ( 1024 )
    count = 0
    cnt = 0
    for i in range ( 1 , n + 1 , 2 ) :
        for j in range ( 1 , i + 1 ) :
            if i % j == 0 :
                count += 1
        if count == 8 :
            cnt += 1
        count = 0
    print ( cnt )
