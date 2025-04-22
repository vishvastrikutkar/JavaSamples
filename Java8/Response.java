package Java8;

class Response
{
    private final String responseBody;
    private final int statusCode;
    private final String responseType;

    Response(String body,int code,String type)
    {
        this.responseBody=body;
        this.statusCode=code;
        this.responseType=type;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getResponseType() {
        return responseType;
    }

    public String getResponseBody() {
        return responseBody;
    }

    @Override
    public String toString()
    {
        return "\nResponse Body: "+getResponseBody()+"\t"+"Response Code: "+ getStatusCode()+"\tResponse type: "+getResponseType();
    }

}