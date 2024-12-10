public class AlbumDatabase {
    for(int i = 0; i < albums.length; i++) {
        System.out.println(albums[i]);
    }
    boolean sorted = false;

    while (sorted == false)
    {
        sorted = true;
        for (int i = 0; i < albums.length - 1; i++)
        {
            if (albums[i].author - albums[i + 1].author > 0)
            {
                Album temp = albums[i];
                albums[i] = albums[i + 1];
                albums[i + 1] = temp;
                sorted = false;
            }
        }
    }
    int authorForCounter;
    int counter;
    int min = 10000;
    for (int i = 0; i < albums.length; i++) 
    {
        counter = 1;

        for (int j = i + 1; j < albums.length; j++)
        {
            if (albums[i].author.equals(albums[j].author))
            {
                counter++;
                authorForCounter = albums[i].author;
                if (counter > 1)
                {
                    if (albums[i].year > albums[j].year)
                    {
                        Album tmp = albums[i];
                        albums[j] = albums[i];
                        albums[i] = tmp;
                    }
                }
            }
        }
        /* 
        if (counter > 1)
        {
            sorted = false;
            while (sorted == false)
            {
                sorted = true;
                for (int j = 0; j < albums.length; j++)
                {
                    if (albums[j].author.equals(authorForCounter))
                    {
                        for (int k = 0; k < albums.length; k++)
                        {
                            if (albums[j].year - albums[j + 1].year > 0)
                            {
                                Album temp = albums[i];
                                albums[i] = albums[i + 1];
                                albums[i + 1] = temp;
                                sorted = false;
                            }
                        }
                    }  
                }

            }
            }
            

        }

        }
        
    } */

    for (int i = 0; i < albums.length; i++)
    {
        if(albums[i].title == "Kraftwerk") {
            System.out.println(albums[i]);  
        }

    }
    int min = 1000;
    for (int i = 0; i < albums.length; i++)
    {
        if(albums[i].title.length < min){
            max = albums[i].hours;
        }
    }
    for (int i = 0; i < albums.title.length; i++)
    {
        if(albums[i].hours == min){
            System.out.println(albums[i]);
        }
    }
    int maxHours = 0;
    int maxMinutes = 0;
    int maxSeconds = 0;
    for (int i = 0; i < albums.length; i++) 
    {
        if (albums[i].hours > maxHours) {
            if (albums[i].minutes > maxMinutes)) {
                if (albums[i].seconds > maxSeconds) {
                    maxHours = albums[i].hours;
                    maxMinutes = albums[i].minutes;
                    maxSeconds = albums[i].seconds;
                }
                else 
                {
                    maxMinutes = albums[i].minutes;
                }
            } 
            else 
            {
                maxHours = albums[i].hours;
            }
        }
    }
    maxIndex = 0;
    for (int i = 0; i < albums.length; i++) 
    {
        if (albums[i].hours > maxHours) 
        {
            if (albums[i].minutes > maxMinutes)) 
            {
                if (albums[i].seconds > maxSeconds) 
                {
                    maxIndex = i;
                }
                else 
                {
                    maxIndex = i;
                }
            } 
            else
            {
                maxIndex = i;
            }
        }
    }
    System.out.println(albums[maxIndex]);
}
}