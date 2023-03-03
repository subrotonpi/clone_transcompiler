def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.corpus import words
    from nltk.corpus import brown
    phrases = [ brown.words ( ) , brown.words ( ) , brown.words ( ) ]
    phrases = [ words.split ( ) for words in phrases ]
    if ( '5' in phrases and '5' in phrases and '7' in phrases ) :
        print ( 'YES' )
    else :
        print ( 'NO' )
