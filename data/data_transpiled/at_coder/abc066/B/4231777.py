def main ( ) :
    import sys
    from string import ascii_lowercase
    sc = sys.stdin
    s = sc.read ( )
    if len ( s ) % 2 == 0 :
        s = s [ : - 1 ]
    ans = 0
    for i in range ( 1 , len ( s ) , 2 ) :
        index = len ( s ) - i
        s1 = s [ : index // 2 ]
        s2 = s [ index // 2 : index ]
        if s1 == s2 :
            ans = index
            break
    print ( ans )
