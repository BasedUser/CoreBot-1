package corebot;

public enum Info{
    links("Различные ссылки",
    """
    Внимание! Учитывайте, что на каждой ссылке от Вас могут ожидать использование *английского языка*.

    [Исходный код на GitHub](https://github.com/Anuken/Mindustry/)
    [Форма предложений](https://github.com/Anuken/Mindustry-Suggestions/issues/new/choose)
    [Форма сообщений о багах](https://github.com/Anuken/Mindustry/issues/new/choose)
    [Trello](https://trello.com/b/aE2tcUwF)
    [Версия Steam](https://store.steampowered.com/app/1127400/Mindustry/)
    [APK для Android и версия itch.io](https://anuke.itch.io/mindustry)
    [Версия iOS](https://itunes.apple.com/us/app/mindustry/id1385258906?mt=8&ign-mpt=uo%3D8)
    [Описание на Google Play](https://play.google.com/store/apps/details?id=mindustry)
    [Ссылка на TestFlight](https://testflight.apple.com/join/79Azm1hZ)
    [Сообщество Mindustry на Reddit](https://www.reddit.com/r/mindustry)
    [Неофициальное пространство Matrix](https://matrix.to/#/#mindustry-space:matrix.org)
    """),
    beta("Бета-версия на iOS",
    """
    Что-бы присоединиться к бета-тестированию на iOS, нажмите на [данную ссылку](https://testflight.apple.com/join/79Azm1hZ), затем установите приложение TestFlight от Apple.

    На Google Play бета-тестирование приостановлено. Скачайте версию с itch.io.
    """),
    rules("Правила",
    """
    1. Грубость запрещена. Запрещены расизм/сексизм и т.д. Чрезмерное использование мата запрещено.

    2. Спам (флуд) и реклама запрещены.

    3. NSFW и политика запрещены. Это включает NSFW-обсуждения. Обсуждение \"спецоперации\" на Украине строго запрещено.

    4. Пишите в соответствующие теме обсуждения каналы.

    5. Не публикуйте приглашение на этот сервер в общественных местах, не связанных с Mindustry.

    6. Не выпрашивайте роли. Если потребуется модератор, мы сами его выберем.

    7. Не выдавайте себя за других членов сообщества и не редактируйте свои сообщения, чтобы ввести других в заблуждение.

    8. Не отправляйте одно и то же сообщение в нескольких каналах подряд.

    9. Не отправляйте другим нежеланные личные сообщения. Сообщайте о нарушении этого правила любому модератору.

    10. Запрещён обход банов. Любые альт-аккаунты, отправляющие что-либо на сервере, будут забанены. Разрешено использование альт-аккаунта для запросов на разбан.

    11. Для разговоров разрешён только русский язык.

    Нарушение любого из этих правил может повлечь предупреждение, 3 предупреждения - бан, навсегда.

    Если нам не нравится Ваше поведение, мы вас удалим. Повинуйтесь духу, а не слову.
    """);
    public final String text;
    public final String title;

    Info(String title, String text){
        this.text = text;
        this.title = title;
    }
}
