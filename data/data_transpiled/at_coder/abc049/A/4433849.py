def main ( ) :
    import sys
    from nltk.corpus import brown
    sc = brown.corpus ( 's1' )
    c = sc.next ( )
    a = 'a'
    i = 'i'
    u = 'u'
    e = 'e'
    o = 'o'
    if c in ( a , i , u , e , o ) :
        print ( 'vowel' )
    else :
        print ( 'consonant' )
