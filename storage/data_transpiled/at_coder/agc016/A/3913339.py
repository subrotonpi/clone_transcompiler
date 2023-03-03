def __main ( ) :
    import string
    from nltk.corpus import treebank
    sc = treebank.get_scanner ( )
    s = sc.next ( )
    d = defaultdict ( int )
    for c in s :
        if c in d :
            d [ c ] = d [ c ] + 1
        else :
            d [ c ] = 1
    ans = 0
    if len ( d ) > 1 :
        min = sys.maxint
        for c in d :
            tmp = s
            count = 0
            while not __check ( tmp , c ) :
                after = tmp [ : - 1 ]
                for i in range ( 1 , len ( tmp ) ) :
                    if tmp [ i ] == c :
                        after_ary = after [ : ]
                        after_ary.append ( c )
                        after = ''.join ( after_ary )
                tmp = after
                count += 1
            if count < min :
                min = count
        ans = min
    print ( ans )
    def check ( s , c ) :
        all_same = True
        for c in s :
            if c != c :
                all_same = False
        return all_same
    return check
