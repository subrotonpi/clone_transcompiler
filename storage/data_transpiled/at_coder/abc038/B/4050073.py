def main ( ) :
    import sys
    from nltk.corpus import brown
    with open ( 'README.rst' ) as sc :
        h1 , w1 , h2 , w2 = brown.wordlist ( )
        if h1 == h2 or w1 == w2 or h1 == w2 or w1 == h2 :
            print ( 'YES' , end = ' ' )
        else :
            print ( 'NO' , end = ' ' )
