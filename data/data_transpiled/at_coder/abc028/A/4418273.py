def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.corpus import stopwords
    score = stopwords ( )
    if score <= 59 :
        print ( 'Bad' )
    elif score >= 60 and score <= 89 :
        print ( 'Good' )
    elif score >= 90 and score <= 99 :
        print ( 'Great' )
    else :
        print ( 'Perfect' )
