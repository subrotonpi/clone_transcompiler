def main ( ) :
    import sys
    from nltk.corpus import brown
    sc = brown.corpus ( 'a' )
    if sc.next ( ) in [ 'a' , 'i' , 'u' , 'e' , 'o' ] :
        print ( 'vowel' )
    else :
        print ( 'consonant' )
